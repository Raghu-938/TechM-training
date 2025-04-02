MySQL Developer Bundle for Enterprise Linux

INSTALLING

Unpack the downloaded tar bundle:

tar xvf mysql-enterprise-<REL_VERSION>-javascript_el<VERSION>_<ARCH>_bundle.tar

For example:

tar xvf mysql-enterprise-8.4.0-javascript_el9_x86_64_bundle.tar

In order to easily manage installation of MySQL products and components,
we will set up a local Yum package repository:

Add the MySQL GPG key to your system in order to verify packages at
install time:

sudo rpm --import https://repo.mysql.com/RPM-GPG-KEY-mysql-2023

Install utilities that aid in Yum repo setup:

sudo yum install yum-utils

Add the downloaded developer bundle as a yum repo:

sudo yum-config-manager --add file:///path/to/rpms

Example path: file:///home/username/mysql

For Oracle/Red Hat Linux 8 only: disable the MySQL module that comes
with the OS distribution:

sudo yum module disable mysql

Then, to install MySQL Server:

sudo yum install mysql-commercial-server

Or, for any of the other included products:

sudo yum install mysql-commercial-backup
sudo yum install mysql-commercial-client
sudo yum install mysql-connector-c++-commercial
sudo yum install mysql-connector-c++-commercial-jdbc
sudo yum install mysql-connector-j-commercial
sudo yum install mysql-connector-odbc-commercial
sudo yum install mysql-connector-odbc-commercial-setup
sudo yum install mysql-connector-python3-commercial
sudo yum install mysql-router-commercial
sudo yum install mysql-shell-commercial

INCLUDED PRODUCTS

mysql-commercial-server: The MySQL Server software delivers a very fast,
multi-threaded, multi-user, and robust SQL (Structured Query Language)
database server. This package includes the MySQL server binary as well
as related utilities to run and administer a MySQL server.

mysql-commercial-backup: MySQL Enterprise Backup provides DBAs with a
high-performance, online “hot” backup solution with data compression
technology to ensure your data is protected in case of downtime or an
outage.

mysql-commercial-client: This package contains the standard MySQL
clients and administration tools.

mysql-connector-c++-commercial: A C++ interface for communicating with
MySQL servers. The Connector/C++ X DevAPI can also be used by C
applications.

mysql-connector-c++-commercial-jdbc: MySQL Driver for C++ mimics the
JDBC 4.0 API. MySQL Connector/C++ provides developers a JDBC-like API
driver for MySQL.

mysql-connector-j-commercial: MySQL Connector/J is the official JDBC
driver for MySQL. MySQL provides connectivity for client applications
developed in the Java programming language with MySQL Connector/J, a
driver that implements the Java Database Connectivity (JDBC) API.

mysql-connector-odbc-commercial: Connector/ODBC is a standardized
database driver for Windows, Linux, Mac OS X, and Unix platforms.
mysql-connector-odbc driver comes in 2 flavours - ANSI and Unicode.

mysql-connector-python3-commercial: MySQL Connector/Python enables
Python programs to access MySQL databases, using an API that is
compliant with the Python DB API version 2.0. It is written in pure
Python and does not have any dependencies except for the Python Standard
Library. This is the Python 3 version of the driver.

mysql-router-commercial: MySQL Router is lightweight middleware that
provides transparent routing between your application and any backend
MySQL Servers. It can be used for a wide variety of use cases, such as
providing high availability and scalability by effectively routing
database traffic to appropriate backend MySQL Servers.

mysql-shell-commercial: The MySQL Shell is an interactive Javascript,
Python, or SQL interface supporting development and administration for
the MySQL Server and is a component of the MySQL Server. Users can use
the MySQL Shell to perform data queries and updates as well as various
administration operations.


