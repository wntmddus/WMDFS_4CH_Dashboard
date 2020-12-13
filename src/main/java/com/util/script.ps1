$headers = New-Object "System.Collections.Generic.Dictionary[[String],[String]]"
$headers.Add("Authorization", "Basic cnUyZm41aDluMzpqdm9hWmFidnVKQUUyNDA0ZXdnUG5zdnpYODVOS2ZqZA==")
$headers.Add("id", "ru2fn5h9n3")
$headers.Add("secret", "jvoaZabvuJAE2404ewgPnsvzX85NKfjd")
$headers.Add("Content-Type", "application/json")

#$body = "{`n    `"extDeviceId`": `"Device1222`",`n    `"connectionMac`": `"286d97b70aa1`",`n    `"dateTime`": `"2020-10-21 10:12:00`",`n    `"rawData`": [`n        {`n            `"sensorData`": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `"sensorData`": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `"sensorData`": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `"sensorData`": [0.01, 140, 0.02, 150, 0.03, 120]`n        },`n        {`n            `"sensorData`": [0.01, 140, 0.02, 150, 0.03, 120]`n        }`n    ]`n}"
$body = "{`n }"
$response = Invoke-WebRequest 'https://ddms-api.samsunghrm.com/v2/ddms/service/extLogs' -Method 'POST' -Headers $headers -Body $body
$response