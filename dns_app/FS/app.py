from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/register', methods=['PUT'])
def register():
    # your registration logic here
    return jsonify({"message": "Registration logic here"})

@app.route('/fibonacci', methods=['GET'])
def fibonacci():
    # your Fibonacci logic here
    return jsonify({"message": "Fibonacci sequence logic here"})

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=9090)
