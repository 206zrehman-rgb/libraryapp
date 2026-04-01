<h1>Library App</h1>
<h1>https://libraryapp-production-fbd4.up.railway.app</h1>

A simple application built with java and spring boot that allows users to manage their collection of books as well as provide details such as the date they started, a description and a score.

<h2>Tech stack</h2>
Java 17
spring boot
Maven
Rest API
Railway


<h2>/createBook</h2>
this allows a book to be added to the arraylist
Example request body:
{
  "name": "The odyssey",
  "description": "getting lost for 20 years and people want your wife",
  "startDate": "2025-03-31",
  "endDate": "2025-04-05",
  "score": 9.5
}


<h2>/books</h2>
Get request showing all the books in the array


<h2>/books/{name}</h2>
Delete a book

<h2>Deployment</h2>
This project uses Railway and can be accessed online


<h2>Future improvements</h2>
i plan to add a database as well as a front end.
