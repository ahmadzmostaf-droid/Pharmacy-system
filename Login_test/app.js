function validateLogin(username, password) {
    if (username === "admin" && password === "999") {
        return true;
    }
    return false;
}

module.exports = validateLogin;