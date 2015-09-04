# oauth2-samples

1. TO GET TOKEN 
 curl -X POST -vu webclient:7b5a38705d7b3562655925406a652e32 http://localhost:8080/oauth/token -H "Accept: application/json" -d "password=spring&username=craig&grant_type=password"
  response will have token and refresh token
  {
    access_token: "2d1ad3c6-6454-43d7-81b2-4f9a553e531a"
    token_type: "bearer"
    refresh_token: "31a770cf-a4ff-4ed2-a745-cee798610cec"
    expires_in: 59
    scope: "read write"
  }
  
2. TO GET NEW TOKEN USING REFRESS TOKEN
curl -X POST -vu webclient:7b5a38705d7b3562655925406a652e32 http://localhost:8080/oauth/token -H "Accept: application/json" -d "grant_type=refresh_token&refresh_token=31a770cf-a4ff-4ed2-a745-cee798610cec"
   Fresh token response
   {
      access_token: "4dbbb73f-ed00-4dac-95ab-5526e2a895e9"
      token_type: "bearer"
      refresh_token: "fc6a32c8-a216-4685-8c42-63c942e8ed54"
      expires_in: 59
      scope: "read write"
    }
3. USE ACCESS TOKEN TO ACCESS SERVICE
http://localhost:8080/customer/1?access_token=4dbbb73f-ed00-4dac-95ab-5526e2a895e9

