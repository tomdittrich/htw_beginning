#!/usr/bin/python
from socket import *

addr = ("127.0.0.1", 4224)
buf = 128
UDPSock = socket(AF_INET, SOCK_DGRAM)
UDPSock.bind(addr)
while 1:
    data, addr = UDPSock.recvfrom(buf)
    if data:
        print("Client:", addr, " Nachricht:", data.decode("utf-8"))  # decode converts from bytes into String
        UDPSock.sendto(b"Hallo Client!", addr)  # converts String into bytes
    else:
        break
UDPSock.close()
