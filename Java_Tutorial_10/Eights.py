import socket

def udp_server():
    host = 'localhost'
    port = 54321

    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as server_socket:
        server_socket.bind((host, port))
        print('UDP Server listening on port 54321...')

        while True:
            data, addr = server_socket.recvfrom(1024)  # Receive data from client
            message = data.decode()
            print(f'Received from {addr}: {message}')

            # Send acknowledgment if the message is "UDP Message"
            if message == "UDP Message":
                ack_message = "ACK: UDP Message received"
                server_socket.sendto(ack_message.encode(), addr)

udp_server()
