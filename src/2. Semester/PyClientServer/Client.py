#!/usr/bin/python
from socket import *

host = "127.0.0.1"
port = 4224
addr = (host, port)
buf = 128
UDPSock = socket(AF_INET, SOCK_DGRAM)
data = b"Client hier!"  # converts String into bytes
UDPSock.sendto(data, addr)
(data, addr) = UDPSock.recvfrom(buf)
print("Server:", addr, " Nachricht:", data.decode("utf-8"))  # decode converts from bytes into String
UDPSock.close()
