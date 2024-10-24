import socket
import json

def tcp_server():
    host = 'localhost'
    port = 12345

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server_socket:
        server_socket.bind((host, port))
        server_socket.listen(1)
        print("Server is listening...")
        conn, addr = server_socket.accept()
        with conn:
            print('Connected by', addr)
            data = conn.recv(1024)
            numbers = json.loads(data.decode())
            print('Received numbers:', numbers)
            result = str(sum(numbers))
            conn.sendall(result.encode())

tcp_server()
