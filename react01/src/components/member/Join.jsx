import React from 'react';

const Join = () => {
  return (
    <>
      <form>
        <input type="text" name="userId" placeholder="ID:" />
        <br />
        <input type="text" name="userPwd" placeholder="Pwd:" />
        <br />
        <input type="text" name="userNick" placeholder="Nick:" />
        <br />
        <input type="button" value={'submit'} />
        <br />
      </form>
    </>
  );
};

export default Join;
