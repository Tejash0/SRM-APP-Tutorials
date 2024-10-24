import socket
import random

def udp_client():
    host = 'localhost'
    port = 54321
    number = random.randint(1, 100)

    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as client_socket:
        print(f'Sending number: {number}')
        client_socket.sendto(str(number).encode(), (host, port))
        data, _ = client_socket.recvfrom(1024)
        print('Received from server:', data.decode())

udp_client()
