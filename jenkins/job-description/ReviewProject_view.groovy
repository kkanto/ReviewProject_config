 
listView('ReviewProject Jobs') {
    description('ReviewProject Jobs')
    jobs {
        regex('ReviewProject_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
