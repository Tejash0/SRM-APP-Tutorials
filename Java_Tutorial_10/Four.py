import socket
import json

def tcp_client():
    host = 'localhost'
    port = 12345

    numbers = [1, 2, 3, 4, 5]  # List to send to server

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client_socket:
        client_socket.connect((host, port))
        client_socket.sendall(json.dumps(numbers).encode())
        response = client_socket.recv(1024)
        print('Sum of numbers from server:', response.decode())

tcp_client()
