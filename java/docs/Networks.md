# Networks

## LAN

Local Area Network

## WAN

Wide Area Network

## VPN

Virtual Private Network

## Client Server Model

Client is remote to server. They connect to server with a fixed connection.

## HTTP

A fixed format for communication - both ends of the connection know what it is

Protocol for the transferral of hypertext. This is used by browsers to request and receive web pages.

## TCP/IP stack

Transmissions Control Protocol and Internet Protocol stack

Used commonly over the world. Together these 2 protocols form the backbone of internet communication

## UDP

User Datagram Protocol is a connectionless protocol that is used by applications that don't require 

## DNS

Domain Name Server

## Ports

Ports are simiply a number. There are a number or port numbers you shouldn't use, as they are fixed and won't change.

E.g. SSH is port 22. HTTP is port 80.

## Serialization

Objects are sent between machines, rather than numbers and strings.

Very useful:
- Data isn't split up

## Host and Port

```java
private static final int PORT = 8889;
private static final String HOST = "localhost"; 
```

## Awaiting client connection

Waits for  client connections, with the `accept()` method.
```java
Socket clientSocket = serverSocket.accept()
```

