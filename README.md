## A Spring Data ElasticSearch Service

Steps to run the project:
1.  Download and install elasticsearch 7.8.0 https://www.elastic.co/downloads/past-releases/elasticsearch-7-8-0
2.  In elasticsearch.yml file in the config directory set the following properties `cluster.name` and `path.data` to one's appropriate name and path. Also set `discovery.type: single-node`.
3.  Start elasticsearch by running elasticsearch.bat from bin directory.
4.  Clone and import the project.
5.  Set the following properties in application.properties. `spring.application.name=spring-elastic-search-service`, `server.port=8751`, `spring.data.elasticsearch.cluster-name={cluster name set in elasticsearch.yml}`, `spring.data.elasticsearch.cluster-nodes=localhost:9751`
6.  `mvn clean install` and `mvn spring-boot:run`
7.  Call the apis.
    ```
    POST http://localhost:8751/saveCustomers
     
     [
       {
     	  "id":"1",
     	  "firstname" : "Peter",
     	  "lastname" : "Roberts",
     	  "age" : 45
       },
       {
     	  "id":"2",
     	  "firstname" : "Tina",
     	  "lastname" : "Smith",
     	  "age" : 48
       },
       {
     	  "id":"3",
     	  "firstname" : "Carrie",
     	  "lastname" : "Johnson",
     	  "age" : 51
       },
       {
     	  "id":"4",
     	  "firstname" : "PETER",
     	  "lastname" : "Roberts",
     	  "age" : 45
       }
     ]
     
     GET http://localhost:8751/findAll - This will return all records from database
     
     GET http://localhost:8751/findByFirstName/peter - This will return case-insensitive search on first name```