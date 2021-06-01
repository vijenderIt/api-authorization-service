
# TokenAPITester

## Getting started

## Notes

## API


##### Request URL <Example>

```
POST /getAPIToken

{
	"username": "",
	"password": "" 
	
}
```

```

POST /testAPIToken

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

