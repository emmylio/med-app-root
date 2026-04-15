import { useEffect, useState } from 'react';

function App() {
  const [mensagem, setMensagem] = useState('Carregando...');

  useEffect(() => {
    fetch('http://localhost:8080/api/hello')
      .then(response => response.text())
      .then(data => setMensagem(data))
      .catch(error => setMensagem("Erro ao conectar no backend."));
  }, []);

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h1>{mensagem}</h1>
    </div>
  );
}

export default App;