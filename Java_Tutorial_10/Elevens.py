import socket

def receive_file():
    host = 'localhost'
    port = 12345
    output_file = 'received_file.txt'

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server_socket:
        server_socket.bind((host, port))
        server_socket.listen(1)
        print("Server is listening...")
        conn, addr = server_socket.accept()
        with conn:
            print('Connected by', addr)
            data = conn.recv(1024).decode()
            with open(output_file, 'w') as file:
                file.write(data)
            print("File received and saved as", output_file)

receive_file()
