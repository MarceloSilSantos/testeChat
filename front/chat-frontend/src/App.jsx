import { useState } from 'react'
import './App.css'
import './Chat'

function App() {
  const [count, setCount] = useState(0)

  return (

    <div className="App">
    <h1>Chat Simples</h1>
    <Chat />
</div>

    
  )
}

export default App
