# Data management application - Shop compare

Table of contents
---
- [General info](#general-info)
- [Setup](#setup)
  <br/>

General info
---
**Shop compare** is a web application that provides prices comparison for different appliances and electronic
devices. The main goal of this application is to enable customers find their required product at the best price available at the
market. <br/>
We need a central place to define and expose CRUD operations of the entities used in our system and all other operations
related to data management.

**Data management application** 
- is a RESTful API that serves endpoints for fetching categories and products.
  - Categories from db can be fetched using GET request to the endpoint `/categories` as a suffix to the host name
  - Products can be fetched using the following manner:
    - Sending GET request to endpoint `/products` and setting up the shop name and category id as request parameters -> to fetch products of a certain category from a defined shop
    - In order to fetch all other products of a certain category that are not present in the defined shop, use the endpoint `/products/not-in-shop`
    and set up the shop name and category id as request parameters.
- Also, it's a RabbitMQ products consumer which fetches products from the Rabbit MQ queue `scraped_products` and persists them into DB.

Setup 
---
Make sure you have JDK17 installed
Enable dev profile for local setup
Execute mvn clean install
Start the Db Seed Application