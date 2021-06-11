package main.java.com.util;

import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellNotAvailableException;
import com.profesorfalken.jpowershell.PowerShellResponse;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class RestfulApi {
    private static final Logger log = Logger.getLogger(RestfulApi.class);

    public static String post(String path, JSONObject requestBody) throws IOException {
        System.out.println(requestBody.toString());
        PowerShellResponse response = null;
        try (PowerShell powerShell = PowerShell.openSession("pwsh")) {
            //Increase timeout to give enough time to the script to finish
            Map<String, String> config = new HashMap<String, String>();
            //Execute script
            String s = requestBody.toString();
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '"') {
                    str.append('`').append(s.charAt(i));
                } else {
                    str.append(s.charAt(i));
                }
            }

            response = powerShell.executeCommand("[System.Net.ServicePointManager]::ServerCertificateValidationCallback = { $true }\n" +
                    "$headers = New-Object \"System.Collections.Generic.Dictionary[[String],[String]]\"\n" +
                    "$headers.Add(\"Authorization\", \"Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==\")\n" +
                    "$headers.Add(\"id\", \"ru2fn5h9n3\")\n" +
                    "$headers.Add(\"secret\", \"jvoaZabvuJAE2404ewgPnsvzX85NKfjd\")\n" +
                    "$headers.Add(\"Content-Type\", \"application/json\")\n" +
                    "\n" +
                    "$body = \"" + str.toString() + "\"\n" +
                    "$response = Invoke-WebRequest 'https://ddms-api.samsunghrm.com/v2/ddms/service/" + path + "' -Method 'POST' -Headers $headers -Body $body\n" +
                    "$response\n" +
                    "$body");
            powerShell.close();

            //Print results if the script
            System.out.println("Script output:" + response.getCommandOutput());
            log.info("Script output:" + response.getCommandOutput());
        } catch(PowerShellNotAvailableException ex) {
            //Handle error when PowerShell is not available in the system
            //Maybe try in another way?
            log.info(ex);
            System.err.println(ex);
        }
        assert response != null;
        return response.getCommandOutput();
    }
}
