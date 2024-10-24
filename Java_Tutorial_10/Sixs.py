import socket

def udp_server():
    host = 'localhost'
    port = 54321

    with socket.socket(socket.AF_INET, socket.SOCK_DGRAM) as server_socket:
        server_socket.bind((host, port))
        print('UDP Server listening...')
        while True:
            data, addr = server_socket.recvfrom(1024)
            number = int(data.decode())
            print('Received number:', number)
            result = "Even" if number % 2 == 0 else "Odd"
            server_socket.sendto(result.encode(), addr)

udp_server()
