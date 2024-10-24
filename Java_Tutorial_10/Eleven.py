import socket

def send_file():
    host = 'localhost'
    port = 12345
    file_path = 'file_to_send.txt'

    with open(file_path, 'r') as file:
        file_data = file.read()

    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client_socket:
        client_socket.connect((host, port))
        client_socket.sendall(file_data.encode())
        print("File sent!")

send_file()
