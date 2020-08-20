# microservices-using-spring-cloud
This code demonstrates usage of microservices.
1. Run simple-microservices/movie-producer as Java application. Open http://localhost:9090/movie.
2. Run simple-microservices/movie-producer as Java application.

Folder using-eureka contains modified movie-producer and movie-consumer projects and eureka-server used for service registry and discovery.
1. Run using-eureka/eureka-server.
2. Run using-eureka/movie-producer.
3. Run using-eureka/movie-consumer.

Folder using-zull contains all above and movie-netflix-zuul. Project movie-consumer is modified. Project movie-netflix-zuul implements Netflix Zuul component for routing. 
1. Run using-zuul/eureka-server.
2. Run using-zull/movie-producer.
3. Run using-zull/movie-netflix-zuul.
4. Run using-zuul/movie-consumer.
