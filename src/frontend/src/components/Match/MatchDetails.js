import {React} from "react";


export const MatchDetails=({match})=>{

  return (<>
<h2>{match.team1}</h2><h3>vs</h3><h2>{match.team2}</h2>
<h3>{match.venue}</h3>
<h4>{match.date}</h4>
</>)
}