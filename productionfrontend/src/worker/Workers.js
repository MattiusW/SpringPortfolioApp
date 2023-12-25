import React, { useEffect, useState } from 'react'
import axios from 'axios'

export default function Workers () {
  const [workers, setWorkers] = useState([])

  useEffect(() => {
    loadWorkers()
  }, [])

  const loadWorkers = async () => {
    const result = await axios.get('http://localhost:8080/worker/all')
    setWorkers(result.data)
  }

  return (
    <div className='container'>
      <div className='py-4'>
        <table className='table border shadow'>
          <thead>
            <tr>
              <th scope='col'>Id</th>
              <th scope='col'>Name</th>
              <th scope='col'>Ability</th>
              <th scope='col'>Payment</th>
              <th scope='col'>Level</th>
            </tr>
          </thead>
          <tbody>

            {workers.map((workers, index) => (
              <tr>
                <th scope='row' key={index}>{index+1}</th>
                <td>{workers.name}</td>
                <td>{workers.ability}</td>
                <td>{workers.payment}</td>
                <td>{workers.level}</td>
              </tr>
            ))
            }

          </tbody>
        </table>
      </div>
    </div>
  )
}
