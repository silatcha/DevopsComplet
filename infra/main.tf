terraform {
  required_providers {
    docker = {
      source = "kreuzwerker/docker"
      version = "~> 3.0.1"
    }
  }
}


provider "docker" {

}



resource "docker_image" "spring-boot" {
  name = "spring-boot:latest"
}



resource "docker_container" "spring-boot" {
  image = "spring-boot"
  name = "spring-boot"

  ports {

    internal = 8080

    external = 8085

  }
  
}

resource "docker_image" "mysql" {
  name = "mysql:8"
}

resource "docker_container" "mysql" {
  image = "mysql:8"
  name = "mysqldb"

  ports {

    internal = 3306


  }
  
}


resource "docker_tag" "tag" {

  source_image = "spring-boot"

  target_image = "spring-boot"

}


resource "docker_network" "planing-mysql" {

  name = "planing-mysql"

}

