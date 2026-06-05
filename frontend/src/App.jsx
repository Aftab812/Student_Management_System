import { useState } from "react";
import "./App.css";

function App() {

  const [students, setStudents] = useState([]);

  const getStudents = async () => {

    const response = await fetch(
      "http://localhost:9090/students"
    );

    const data = await response.json();

    setStudents(data);
  };

  return (
    <div style={{ padding: "40px" }}>

      <button onClick={getStudents}>
        Get Student
      </button>

      <ul
        style={{
    listStylePosition: "inside",
    textAlign: "center",
  }}>
        {students.map((student) => (
          <li key={student.id}>
            {student.name} - {student.course}
          </li>
        ))}
      </ul>

    </div>
  );
}

export default App;