# create networt
docker network create planing-mysql


# run docker mysql
docker container run --name mysqldb --network planing-mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=123456789 -d mysql:8


# build docker
docker image build -t planing-jdbc .


# run docker spring-boot
docker container run --network planing-mysql --name employee-jdbc-container -p 8085:8080 -d planing-jdbc

# docker-compose
docker-compose up