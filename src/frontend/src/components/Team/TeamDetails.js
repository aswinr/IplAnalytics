import {React} from "react";
import {MatchDetails} from "../Match/MatchDetails";

export const TeamDetails=({team})=>{
return <div className="TeamDetails">
<h1>{team.teamName}</h1>
<h3>{team.totalMatches}</h3>
<h3>{team.totalWins}</h3>

{team.allMatches.map(match=>
  <MatchDetails match={match}/>
)}
</div>
}