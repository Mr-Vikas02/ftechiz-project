FTechiz Screening Project
I have listed the APIs below to make it easy to know which API is defined for what.

API Reference

# Get all items

GET /api/contacts

Note: Using the above API the user will get the list of contacts.
Example: http://localhost:9090/api/contacts (Change your port number)

## Get item by postal code
GET /api/contacts?postalCode=560100

Parameter |	Type   |	Description

params	  | string |	Required. requested Parameter of contact to fetch

Note: Using the above API the user will get the list of contacts based on postal code.
Example: http://localhost:9090/api/contacts?postalCode={postalCode} (Change your port number)

### save new contact
POST /api/contacts
Note: Using the above API the user can create new contacts.

Example: http://localhost:9090/api/contacts (Change your port number)
