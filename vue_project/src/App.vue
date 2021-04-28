<template>
  <div id="app">
    <input @click="HelloWorld" type="button" value="HelloWorld">
  </div>
</template>

<script>

export default {
  name: 'App',
  methods: {
      HelloWorld() {
        this.axios.get('http://localhost:8080/hello')
          .then((response) => {
            alert(response.data);
          })
          .catch((e) => {
            alert(e);
          });
      }
    }
}
</script>
