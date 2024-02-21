# anagrams-project

The interface is a REST API esposing two endpoints, one per each feature.The postman folder contains a postman collection to perform the calls on localhost.

feature #1

POST /anagrams
returns true if a is anagram of b and saves the anagrams
it will be triggered by the following post call:

curl --location --request POST 'http://localhost:8080/anagrams' \
--header 'Content-Type: application/json' \
--data '{
    "a": "toro",
    "b": "roto"
}'

feature #2

GET /anagrams/{inputString}
given the {inputString} retrieves if any of its anagram was saved during feature #1 calls, otherwise it returns an empty set
it will be triggered by the following get call: 

curl --location --request GET 'http://localhost:8080/anagrams/{inputString}' \
--header 'Content-Type: application/json' \
