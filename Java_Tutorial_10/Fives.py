import socket

def udp_server():
    host = 'localhost'
    port = 54321

    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as server_socket:
        server_socket.bind((host, port))
        print('UDP Server listening...')
        while True:
            data, addr = server_socket.recvfrom(1024)
            print('Received:', data.decode(), 'from', addr)
            server_socket.sendto(b'ACK: UDP message received', addr)

udp_server()
