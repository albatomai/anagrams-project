# anagrams-project

feature #1
tells if a is anagram of b and saves the anagrams

curl --location --request POST 'http://localhost:8080/anagrams' \
--header 'Content-Type: application/json' \
--data '{
    "a": "toro",
    "b": "roto"
}'

feature #2
retrieves anagram saved during feature #1 calls

curl --location --request GET 'http://localhost:8080/anagrams/{anagram}' \
--header 'Content-Type: application/json' \
