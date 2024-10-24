import socket

def tcp_server():
    host = 'localhost'
    port = 12345

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server_socket:
        server_socket.bind((host, port))
        server_socket.listen(1)  # Listen for connections
        print("Server is listening on port 12345...")

        while True:
            conn, addr = server_socket.accept()
            with conn:
                print('Connected by', addr)
                data = conn.recv(1024)  # Receive data from the client
                print(f'Received: {data.decode()}')
                conn.sendall(b'Hello, Client!')  # Send a response back to the client

tcp_server()
