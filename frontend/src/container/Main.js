import React, { Component } from 'react';
import '../App.css';
import TimeLine from './TimeLine';

class Main extends Component {

    render() {
        return (
            <div className="Main">
                <header className="App-header">
                    <h1 className="App-title">Test project</h1>
                </header>
                <body>
                    <TimeLine />
                </body>
            </div>
        );
    }
}

export default Main;