package main.java.com.util;

import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellNotAvailableException;
import com.profesorfalken.jpowershell.PowerShellResponse;
import io.restassured.RestAssured;
import okhttp3.*;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import io.restassured.specification.RequestSpecification;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.rmi.server.RemoteRef;
import java.util.HashMap;
import java.util.Map;

import static main.java.com.util.SharedStorage.*;

public class RestfulApi {
    public static final MediaType JSON = MediaType.get("application/json");
    private static final Logger log = Logger.getLogger(RestfulApi.class);
    private static OkHttpClient client = new OkHttpClient();

    public static String post(String path, JSONObject requestBody) throws IOException {
        System.out.println(requestBody.toString());
//        Process process = Runtime.getRuntime().exec("curl -k -i --trace-ascii --insecure --location --request POST 'https://ddms-api.samsunghrm.com/v2/ddms/service/extLogs' --header 'Authorization: Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==' --header 'id: ru2fn5h9n3' --header 'secret: jvoaZabvuJAE2404ewgPnsvzX85NKfjd' --header 'Content-Type: application/json' --data-raw '" + requestBody.toString() + "'");
//        InputStream is = process.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
//        StringBuilder responseStrBuilder = new StringBuilder();
//
//        String line;
//
//        while ((line = br.readLine()) != null) {
//            System.out.println("read line from curl command: " + line);
//            responseStrBuilder.append(line);
//        }
//        System.out.println(responseStrBuilder);
//        BufferedInputStream in = null;

//        System.out.println("process" + response.toString());
//        String[] command = {"curl", "-k", "-i"};
//        RestAssured.baseURI = BASE_URL;
//        RestAssured.basePath = path;
//        System.out.println(RestAssured.baseURI + RestAssured.basePath);
//        System.out.println(requestBody.length());
//        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation()
//                .contentType(APPLICATION_JSON).header(AUTHORIZATION, "Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==").header(ID, "ru2fn5h9n3").header(SECRET, "jvoaZabvuJAE2404ewgPnsvzX85NKfjd");
//        request.body(requestBody.toString());
//        Response response = request.filter(new RestAssuredRequestFilter()).post().then().log().all().extract().response();
//        RequestBody body = RequestBody.create(requestBody.toString(), JSON);
//        Request request = new Request.Builder().url(BASE_URL + path)
//                .header("Content-Type", APPLICATION_JSON)
//                .header(AUTHORIZATION, "Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==")
//                .header(ID, "ru2fn5h9n3")
//                .header(SECRET, "jvoaZabvuJAE2404ewgPnsvzX85NKfjd")
//                .post(body).build();
//        try (Response response = client.newCall(request).execute()) {
//            log.info(response.message());
//            log.info(response.networkResponse());
//            log.info(response);
//            log.info(response.body().toString());
//            return response;
//        } catch (IOException e) {
//            log.error(e);
//        }
//        String cmd = "curl -k -i --trace-ascii --insecure --location --request POST 'https://ddms-api.samsunghrm.com/v2/ddms/service/extLog' --header 'Authorization: Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==' --header 'id: ru2fn5h9n3' --header 'secret: jvoaZabvuJAE2404ewgPnsvzX85NKfjd' --header 'Content-Type: application/json' --data-raw '" + requestBody.toString() + "'";
//        String power = "powershell.exe [System.Net.ServicePointManager]::ServerCertificateValidationCallback = { $true }\n" +
//                "$headers = New-Object \"System.Collections.Generic.Dictionary[[String],[String]]\"\n" +
//                "$headers.Add(\"Authorization\", \"Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==\")\n" +
//                "$headers.Add(\"id\", \"ru2fn5h9n3\")\n" +
//                "$headers.Add(\"secret\", \"jvoaZabvuJAE2404ewgPnsvzX85NKfjd\")\n" +
//                "$headers.Add(\"Content-Type\", \"application/json\")\n" +
//                "\n" +
//                "$body = \"{`n    `\"extDeviceId`\": `\"Device1222`\",`n    `\"connectionMac`\": `\"286d97b70aa1ㄴㄴ`\",`n    `\"dateTime`\": `\"2020-10-21 10:12:00`\",`n    `\"rawData`\": [`n        {`n            `\"sensorData`\": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `\"sensorData`\": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `\"sensorData`\": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `\"sensorData`\": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `\"sensorData`\": [0.01, 140, 0.02, 150, 0.03, 120]`n        }`n    ]`n}\"\n" +
//                "\n" +
//                "$response = Invoke-WebRequest 'https://ddms-api.samsunghrm.com/v2/ddms/service/extLogs' -Method 'POST' -Headers $headers -Body $body\n" +
//                "$response";
        PowerShellResponse response = null;
//        System.out.println("sdf"+ response);
        try (PowerShell powerShell = PowerShell.openSession()) {
            //Increase timeout to give enough time to the script to finish
            Map<String, String> config = new HashMap<String, String>();
//            config.put("maxWait", "80000");
            //Execute script
            String s = requestBody.toString();
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '{') {
//                    str.append(s.charAt(i)).append("`n");
//                }
                if (s.charAt(i) == '"') {
                    str.append('`').append(s.charAt(i));
                } else {
                    str.append(s.charAt(i));
                }
            }
//            System.out.println(str.toString());
//            powerShell.executeCommand("$body = " + str.toString());
//            PowerShellResponse r = powerShell.executeCommand("$body");
//            System.out.println("sdfsdf" + r.getCommandOutput());
//            Thread.sleep(3000);
            powerShell.executeCommand("[System.Net.ServicePointManager]::ServerCertificateValidationCallback = { $true }");
//            powerShell.executeCommand("$headers = New-Object \"System.Collections.Generic.Dictionary[[String],[String]]\"");
//            powerShell.executeCommand("$headers.Add(\"Authorization\", \"Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==\")");
//            powerShell.executeCommand("$headers.Add(\"id\", \"ru2fn5h9n3\")");
//            powerShell.executeCommand("$headers.Add(\"secret\", \"jvoaZabvuJAE2404ewgPnsvzX85NKfjd\")");
//            powerShell.executeCommand("$headers.Add(\"Content-Type\", \"application/json\")");
//            powerShell.executeCommand("$response = Invoke-WebRequest 'https://ddms-api.samsunghrm.com/v2/ddms/service/extLogs' -Method 'POST' -Headers $headers -Body $body");
            response = powerShell.executeCommand("$headers = New-Object \"System.Collections.Generic.Dictionary[[String],[String]]\"\n" +
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
    public static String invokeCurlGet(String _host, int _maxResLength, Charset _charset) throws IOException
    {
        byte[] res = execute(_host, _maxResLength);

        return new String(res, _charset);
    }

    public static byte[] execute(String _cmd, int _maxResLength) throws IOException
    {
        Process process = Runtime.getRuntime().exec(_cmd);

        try
        {
            int result = process.waitFor();
//            if(result != 0)
//            {
//                throw new IOException("Fail to execute cammand. Exit Value[" + result + "], cmd => " + _cmd);
//            }
        }
        catch(InterruptedException e)
        {
            process.destroyForcibly();

            throw new IOException(e);
        }

        BufferedInputStream in = null;

        try
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            in = new BufferedInputStream(process.getInputStream());
            byte[] buf = new byte[1024];
            int read = 0;

            while((read = in.read(buf)) != -1)
            {
                out.write(buf, 0, read);
                out.flush();

                if(_maxResLength > 0 && out.size() > _maxResLength)
                {
                    throw new IOException("Response length exceeded.");
                }
            }

            return out.toByteArray();
        }
        finally
        {
            if(in != null)
            {
                in.close();
            }
        }
    }
}
