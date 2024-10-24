import socket
import time

def tcp_client():
    host = 'localhost'
    port = 12345

    start_time = time.time()  # Start the timer

    try:
        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client_socket:
            client_socket.connect((host, port))  # Connect to the server
            client_socket.sendall(b'Hello, Server!')

            response = client_socket.recv(1024)  # Wait for the server's response
            end_time = time.time()  # End the timer
            elapsed_time = end_time - start_time

            print(f'Received from server: {response.decode()}')
            print(f'Time taken to connect and receive response: {elapsed_time:.4f} seconds')

    except Exception as e:
        print(f"Error: {e}")

tcp_client()
