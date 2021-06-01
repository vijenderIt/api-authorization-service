
# RetailShipmentCreation

## Getting started

To build: `mvn package`

To Run in MOCK mode: `java -jar target/retail-shipment-creation-service-0.0.1-SNAPSHOT.jar --spring.profiles.active=mock`

Test request resource: `curl -Gv http://localhost:8080/v1/createshipments`

## TODO

- Test app
- Build app
- Document app

## Notes

## API
```
GET /v1/createshipments/{id}
```

### Testing


## Runtime Dependencies
- <TODO>

#### List full maven deps

```
mvn dependency:resolve
mvn -o dependency:list \
| grep ":.*:.*:.*" \
| cut -d] -f2- \
| sed 's/:[a-z]*$//g' \
| sort -u 
```

## Tables

### CreateShipment <Example>
Column                | Data Type            | Key         | Description
:-------------------- | :--------------------| :---------- | :-------------
id                    | 128bit base64 string | Primary Key | Id
name                  | string               |             | Name of something 

## Configuration

### Spring Boot Profiles

Profile Name | Configuration Type    | Suitable for Prod? | When to use
:----------- | :-------------------- | :----------------- | :-----------------------------------
cloud        | VCAP_SERVICES JSON    | Yes                | When deploying to a PaaS environment such as Cloud Foundry
mock         | None                  | No                 | Unit and local testing without external dependencies
<none>       | Environment Variables | Yes                | Any non PaaS deployment such as as CloudOps VM or running locally




#### Cloud
- Oracle: Injected by Spring Cloud Connectors using `VCAP_SERVICES`

#### Local <Example>

- Message repo:
  - `spring.datasource.url=jdbc:mysql://localhost/test`
  - `spring.datasource.username=dbuser`
  - `spring.datasource.password=dbpass`
  - `spring.datasource.maximum-pool-size=30`

## Flows

##### Request URL <Example>

```
PUT /v1/createshipment/{id}
```
##### Request Body: CreateShipment (TODO Example)

##### Example Response Body (TODO Example)

```
{
    
}

```

##### Example Response Status

```
200 OK
```

## HTTP Response Codes

Status Code        | Reason        
:------------------| :-----------------
200 OK             |  The request has succeeded
201 Created        |  The request has been fulfilled and resulted in a new resource being created
400 Bad Request    | The request was malformed, was missing required attributes or contained invalid attributes. Additional details about what went wrong will be included in the response
401 Unauthorized   | The auth credentials were invalid or missing from the header
403 Forbidden      | The request is understood, but it has been refused or access is not allowed
404 Not Found      | The requested resource could not be found
50X Internal Error | An internal error occurred. The request can be retried

