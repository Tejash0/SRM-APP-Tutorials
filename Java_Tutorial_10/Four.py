import socket
import json

def tcp_client():
    host = 'localhost'  # Ensure this matches your server's address
    port = 12345  # Ensure this matches the port your server is listening on

    # List to send to the server
    numbers = [1, 2, 3, 4, 5]

    try:
        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as client_socket:
            client_socket.connect((host, port))  # Connect to the server
            client_socket.sendall(json.dumps(numbers).encode())  # Send list as JSON

            # Wait for response (sum of numbers)
            response = client_socket.recv(1024)
            print('Sum of numbers from server:', response.decode())

    except Exception as e:
        print(f"Error: {e}")

tcp_client()
