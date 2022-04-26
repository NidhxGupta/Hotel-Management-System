package com.example.hotelManagementSystem.Model;

public class Login {
    
}

/*

SI_db_username = ['admin','user1','user2']
SI_db_password = ['admin','user1','user2']

# Route for handling the login page logic
@app.route('/login', methods=['GET', 'POST'])
def login():
    error = None
    if request.method == 'POST':
        if request.form['username'] not in SI_db_username or request.form['password'] not in SI_db_password:
            error = 'Invalid Credentials. Please try again.'
        else:
            return redirect(url_for('home'))
    return render_template('login.html', error=error)

    */