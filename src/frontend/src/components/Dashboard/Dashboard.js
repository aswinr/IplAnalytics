import React, { useEffect, useState } from "react";
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import Grid from '@material-ui/core/Grid';


const useStyles = makeStyles({
  root: {
    minWidth: 275,
    margin:5,
    minHeight:100,
    backgroundColor:"#A3A3A3",
    textAlign:"center",
  },
});

export const Dashboard = () => {

  const classes = useStyles();

  const [teams, setTeams] = useState([]);



  useEffect(() => {
    const fetchData = async () => {
      const response = await fetch('http://localhost:8080/teams');
      const data = await response.json();
      setTeams(data);
    }
    fetchData();
  });

  return <Grid container>
      {teams.map(team =>
      <Grid xs={4}>
        <Card className={classes.root} variant="outlined">
          <h2>{team}</h2>
        </Card>
        </Grid>)
      }
      </Grid>

}