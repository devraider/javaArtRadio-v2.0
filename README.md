
# javaArtRadio 2.0 - A Spring boot backend app

This is the backend support for web application for a newer version of ArtRadio (for first version you can check [djangoArtRadio V1](https://github.com/devraider/djangoArtRadio-v1.0)).

ArtRadio it's an ad-free online radio player.


> [!note]
> This project using:
> - JavaScript, Angular framework as frontend – code could be found: [ngArtRadio - Angular](https://github.com/devraider/ngArtRadio-v2.0)
> - Python, as crawler to collect songs from different radio stations – code could be found: [pyArtRadio - Python](https://github.com/devraider/pyArtRadio-v2.0)



## Features

- **Stream Radio Stations**: Access multiple stations for uninterrupted listening.
- **Track History**: See a list of recently played songs from each station's playlist.
- **Song Replays**: Replay songs through YouTube using the embedded player, without any ads.
- **Responsive Design**: Works smoothly on both desktop and mobile.


## Technologies Used

- **Spring Boot**: Core framework for building REST APIs.
- **Hibernate**: ORM for database management.
- **MySQL**: Relational database for storing ecommerce data.
- **Maven**: For project dependency management.


## Getting Started

### Prerequisites

- **Java 17+**
- **MySQL** installed and running
- **Maven** for dependency management
- **Lombok** Java library for reducing boilerplate code, which may need to be enabled in your IDE.

### Installation and Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/devraider/javaArtRadio-v2.0.git
   cd javaArtRadio-v2.0.git
   ```

2. **Configure Database:**
    - Ensure your MySQL server is running.
    - Update the `application.properties` or `.env` file with your MySQL credentials.

3. **Configure Environment Variables:**
    - Example variables you might need to set up:
      ```properties
      JDBC_MYSQL_URI=<your_mysql_uri>
      ...
      ```

4. **Build and Run the Application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

5. **Access API Documentation** (if Swagger is enabled):
    - Go to `http://localhost:<port>/swagger-ui.html` for API documentation and testing.


## API Endpoints

- **/api/radios**: Manage radio stations in the database
- **/api/radioSongs**: Manage songs
- **/api/radioTypes**: Manage radio types
