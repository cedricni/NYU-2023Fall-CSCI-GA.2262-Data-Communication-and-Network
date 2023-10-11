from flask import Flask, request, jsonify

app = Flask(__name__)

# Add your endpoints for registration and DNS query

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=53533)
