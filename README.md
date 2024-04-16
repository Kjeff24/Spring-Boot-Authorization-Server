# SPRING AUTHORIZATION SERVER

A simple oauth authorization server, resource server and an oauth client server

## OAUTH SERVER
To allow OAuth clients to register with an OAuth server, the OAuth server should include the following properties:
```
spring.security.oauth2.authorizationserver.client.demo-client.registration.authorization-grant-types=client_credentials, authorization_code, refresh_token
spring.security.oauth2.authorizationserver.client.demo-client.registration.client-authentication-methods=client_secret_basic
spring.security.oauth2.authorizationserver.client.demo-client.registration.client-id=demo
# registrationId = reg-client
spring.security.oauth2.authorizationserver.client.demo-client.registration.redirect-uris=http://127.0.0.1:8082:8082/login/oauth2/code/reg-client
spring.security.oauth2.authorizationserver.client.demo-client.registration.scopes=user.read, user.write, openid
spring.security.oauth2.authorizationserver.client.demo-client.require-authorization-consent=true
```

## OAUTH CLIENT
```
spring.security.oauth2.client.provider.spring.issuer-uri=http://localhost:8080
# registrationId = reg-client
spring.security.oauth2.client.registration.reg-client.authorization-grant-type=authorization_code
spring.security.oauth2.client.registration.reg-client.client-authentication-method=client_secret_basic
spring.security.oauth2.client.registration.reg-client.client-id=demo
spring.security.oauth2.client.registration.reg-client.client-secret=secret
spring.security.oauth2.client.registration.reg-client.provider=spring
spring.security.oauth2.client.registration.reg-client.scope=user.read, openid
```

# Resource Server
```
spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:8080
```