import socket

def udp_server():
    host = 'localhost'
    port = 54321

    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as server_socket:
        server_socket.bind((host, port))
        print('UDP Server listening on port 54321...')

        while True:
            data, addr = server_socket.recvfrom(1024)  # Receive data from client
            print(f'Received from {addr}: {data.decode()}')

udp_server()
