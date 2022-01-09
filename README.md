REST application

REST application that provides REST API.

Run CustomerService locally

Databse configuration

Create database customerdemo Predefined username - postgres Predefined password - postgres

Access CustomerService using next REST requests:

GET: localhost:9966/api/v1/customers/ - get all customers GET: localhost:9966/api/v1/customers/1 - get customer with ID 1

POST: localhost:9966/api/v1/customers/ Request body: { "firstName": "Kolya", "lastName": "Nikolaev", "address": "Test address", "budget": "100500" }

PUT: localhost:9966/api/v1/customers/ Request body: { "id": 2, "firstName": "Kolya", "lastName": "Nikolaev", "address": "Test address", "budget": "200800" }

DELETE: localhost:9966/api/v1/customers/2 - delete customer with ID 2
