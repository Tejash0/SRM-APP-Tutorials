import socket

def udp_client():
    host = 'localhost'
    port = 54321

    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as client_socket:
        message = "UDP Message"
        client_socket.sendto(message.encode(), (host, port))
        data, _ = client_socket.recvfrom(1024)
        print('Received from server:', data.decode())

udp_client()
