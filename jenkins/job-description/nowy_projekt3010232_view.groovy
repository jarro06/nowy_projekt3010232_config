 
listView('nowy_projekt3010232 Jobs') {
    description('nowy_projekt3010232 Jobs')
    jobs {
        regex('nowy_projekt3010232_.+')
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
