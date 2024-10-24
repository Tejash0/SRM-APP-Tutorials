import socket

def udp_client():
    host = 'localhost'
    port = 54321

    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as client_socket:
        message = "UDP Message"
        client_socket.sendto(message.encode(), (host, port))  # Send message to server

        # Wait for acknowledgment from server
        data, _ = client_socket.recvfrom(1024)
        print(f'Received from server: {data.decode()}')

udp_client()
