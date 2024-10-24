import socket
import json

def tcp_server():
    host = 'localhost'
    port = 12345  # Ensure this matches the port your client is connecting to

    try:
        with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as server_socket:
            server_socket.bind((host, port))
            server_socket.listen(1)  # Listen for incoming connections
            print("Server is listening...")

            while True:
                conn, addr = server_socket.accept()
                with conn:
                    print('Connected by', addr)

                    # Receive data from the client
                    data = conn.recv(1024)
                    if not data:
                        break

                    # Decode the received JSON data into a Python list
                    numbers = json.loads(data.decode())
                    print('Received numbers:', numbers)

                    # Calculate the sum of the numbers
                    result = str(sum(numbers))

                    # Send the sum back to the client
                    conn.sendall(result.encode())

    except Exception as e:
        print(f"Error: {e}")

tcp_server()
