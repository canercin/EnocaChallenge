# Entity Package

This package models the entities in the database for use in the back-end service and defines the relationships between the entities.

# Data Access Layer

This package contains structures that are intended to provide access to the database. Abstraction is provided here with the interfaces I have written. This has made it possible to use multiple access tools without breaking the integrity of the project. Hibernate and Spring Data JPA are used for ease of access.

# Business Layer

This package provides abstraction and modularity by performing operations on data independently of the data access layer and its code.

# API Layer

This layer defines the endpoints where the data will be presented. These endpoints are configured as RESTful services and present data in JSON data type.

# Technologies Used
**Server**: Spring Boot, Hibernate, Spring Data JPA

# API Usage
Job structure usage: https://documenter.getpostman.com/view/25450291/2s9YsT5TnS

Worker structure usage: https://documenter.getpostman.com/view/25450291/2s9YsT5noq
