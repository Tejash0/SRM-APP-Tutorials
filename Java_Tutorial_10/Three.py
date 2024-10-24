import socket

def tcp_client():
    host = 'localhost'
    port = 12345

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client_socket:
        client_socket.connect((host, port))
        client_socket.sendall(b'Hello, Server!')
        response = client_socket.recv(1024)
        print('Received from server:', response.decode())

tcp_client()
