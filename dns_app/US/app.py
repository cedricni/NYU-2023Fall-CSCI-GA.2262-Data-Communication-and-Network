from flask import Flask, request, jsonify
import requests

app = Flask(__name__)

@app.route('/fibonacci', methods=['GET'])
def fibonacci():
    # your logic here
    return jsonify({"message": "Fibonacci logic here"})

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8080)
